package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Dia")
public class Disk {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "maDia")
    private String diskId;

    // mã ChiTietPhieuThue hiện tại đang thuê
    @Column(name = "maChiTietPhieuThue")
    private String rentDetailId;

    @ManyToOne
    @JoinColumn(name = "maTieuDe")
    private Title title;

    @Column(name = "trangThai")
    @org.hibernate.annotations.Type(type="org.hibernate.type.StringNVarcharType")
    private String status;

    public Disk(String rentDetailId, Title titleId, String status) {
        this.rentDetailId = rentDetailId;
        this.title = titleId;
        this.status = status;
    }

    public Disk(Title title, String status) {
        this.title = title;
        this.status = status;
    }

    public Disk() {
    }

    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getRentDetailId() {
        return rentDetailId;
    }

    public void setRentDetailId(String rentDetailId) {
        this.rentDetailId = rentDetailId;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title titleId) {
        this.title = titleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "diskId='" + diskId + '\'' +
                ", rentDetailId='" + rentDetailId + '\'' +
                ", titleId=" + title +
                ", status='" + status + '\'' +
                '}';
    }
}
