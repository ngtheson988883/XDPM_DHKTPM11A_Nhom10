package iuh.se.dhktpm11a;

import iuh.se.dhktpm11a.config.StageManager;
import iuh.se.dhktpm11a.helper.View;
import iuh.se.dhktpm11a.model.entity.Disk;
import iuh.se.dhktpm11a.model.entity.Title;
import iuh.se.dhktpm11a.model.respository.DiskRespository;
import iuh.se.dhktpm11a.model.respository.LateChargeRespository;
import iuh.se.dhktpm11a.model.respository.TitleRespository;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuanLyDVDApplication extends Application {

    protected ConfigurableApplicationContext springContext;
    protected StageManager stageManager;





    public static void main(final String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        springContext = springBootApplicationContext();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stageManager = springContext.getBean(StageManager.class, stage);
        displayInitialScene();

    }

    @Override
    public void stop() throws Exception {
        springContext.close();
    }

    /**
     * Useful to override this method by sub-classes wishing to change the first
     * Scene to be displayed on startup. Example: Functional tests on main
     * window.
     */
    protected void displayInitialScene() {

        // Thay thế View.SAMPLE bằng View đầu tiên xuất hiện khi chương trình khỏi động.
        // Nhớ khai báo đầy đủ trong resource/views và helper/View
        stageManager.switchScene(View.SAMPLE);

    }


    private ConfigurableApplicationContext springBootApplicationContext() {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(QuanLyDVDApplication.class);
        String[] args = getParameters().getRaw().stream().toArray(String[]::new);
        return builder.run(args);
    }
}
