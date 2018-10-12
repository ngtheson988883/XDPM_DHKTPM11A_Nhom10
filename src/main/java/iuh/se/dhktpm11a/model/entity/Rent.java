package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PhieuThue")
public class Rent {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "maPhieuThue")
    private String rentId;

    @ManyToOne
    @JoinColumn(name = "maKhachHang")
    private Customer customer;

    @Column(name = "ngayThue")
    private Date rentDate;



    public Rent() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }



    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId='" + rentId + '\'' +
                ", customer=" + customer +
                ", rentDate=" + rentDate +
                '}';
    }
}
