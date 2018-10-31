package iuh.se.dhktpm11a.model.entity;

import javax.persistence.*;

@Table(name = "ChiTietNo")
@Entity
public class LateCharge {
    @Id
    @JoinColumn(name = "maChiTietPhieuThue")
    private String rentDetailId;
    @Column(name = "phiNo")
    private int lateChargePrice;

    @OneToOne
    @JoinColumn(name = "maChiTietPhieuThue")
    @MapsId
    private RentDetail rentDetail;

    public LateCharge() {
    }

    public String getRentDetailId() {
        return rentDetailId;
    }

    public void setRentDetailId(String rentDetailId) {
        this.rentDetailId = rentDetailId;
    }

    public int getLateChargePrice() {
        return lateChargePrice;
    }

    public void setLateChargePrice(int lateChargePrice) {
        this.lateChargePrice = lateChargePrice;
    }

    public RentDetail getRentDetail() {
        return rentDetail;
    }

    public void setRentDetail(RentDetail rentDetail) {
        this.rentDetail = rentDetail;
    }

    @Override
    public String toString() {
        return "LateCharge{" +
                "rentDetailId='" + rentDetailId + '\'' +
                ", lateChargePrice=" + lateChargePrice +
                ", rentDetail=" + rentDetail +
                '}';
    }
}
