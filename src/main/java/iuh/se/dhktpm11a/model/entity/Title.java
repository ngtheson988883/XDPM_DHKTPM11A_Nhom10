package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "TieuDe")
public class Title {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "maTieuDe")
    private String titleId;

    @JoinColumn(name = "loaiDia")
    @ManyToOne
    private Type diskType;

    @Column(name = "moTa")
    @org.hibernate.annotations.Type(type="org.hibernate.type.StringNVarcharType")
    private String description;

    @Column(name = "tenTieuDe")
    @org.hibernate.annotations.Type(type="org.hibernate.type.StringNVarcharType")
    private String titleName;



    public Title() {
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(titleId, title.titleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleId);
    }

    @Override
    public String toString() {
        return "Title{" +
                "titleId='" + titleId + '\'' +
                ", diskType=" + diskType +
                ", description='" + description + '\'' +
                ", titleName='" + titleName + '\'' +
                '}';
    }
}
