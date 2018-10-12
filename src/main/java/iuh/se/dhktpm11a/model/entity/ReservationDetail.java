package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ChiTietDatTruoc")
public class ReservationDetail {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "maChiTietDatTruoc")
    private String reservationDetailId;

    @OneToOne
    @JoinColumn(name = "maDia")
    private Disk disk;

    @ManyToOne
    @JoinColumn(name = "maTieuDe")
    private Title title;

    @Column(name = "ngayDatTruoc")
    private Date reservationDate;

    @Column(name = "sdt")
    private String phoneNumber;

    @Column(name = "tenKhachHang")
    @org.hibernate.annotations.Type(type="org.hibernate.type.StringNVarcharType")
    private String customerName;



    public ReservationDetail() {

    }

    public String getReservationDetailId() {
        return reservationDetailId;
    }

    public void setReservationDetailId(String reservationDetailId) {
        this.reservationDetailId = reservationDetailId;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "ReservationDetail{" +
                "reservationDetailId='" + reservationDetailId + '\'' +
                ", disk=" + disk +
                ", title=" + title +
                ", reservationDate=" + reservationDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
