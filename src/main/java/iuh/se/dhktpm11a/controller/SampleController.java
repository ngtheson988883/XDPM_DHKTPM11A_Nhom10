package iuh.se.dhktpm11a.controller;

import iuh.se.dhktpm11a.model.respository.LateChargeRespository;
import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {
    @Autowired
    LateChargeRespository lateChargeRespository;

    public void getDate(ActionEvent actionEvent) {
        System.out.println(lateChargeRespository.findByRentDetailId("RDN-1"));
    }
}
