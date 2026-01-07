public class DeliveryRider {

    //2.กำหนด private instance + public static variable
    public int riderId;
    private String name;
    private Short age;
    private String idCard;
    private String carLicense;
    private String diverLicense;
    private String phonNumber;

    //1.สร้าง Constructor ของทุก class อย่างน้อย 2 Constructors
    public DeliveryRider(int riderId) {
        this.riderId = riderId;
    }
    public DeliveryRider(int riderId, String name) {
        this.riderId = riderId;
        this.name = name;
    }
    public DeliveryRider(int riderId, String name, Short age) {
        this.riderId = riderId;
        this.name = name;
        this.age = age;
    }
    public DeliveryRider(int riderId, String name, Short age, String idCard) {
        this.riderId = riderId;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }
    public DeliveryRider(int riderId, String name, Short age, String idCard, String carLicense) {
        this.riderId = riderId;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.carLicense = carLicense;
    }
    public DeliveryRider(int riderId, String name, Short age, String idCard, String carLicense, String diverLicense) {
        this.riderId = riderId;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.carLicense = carLicense;
        this.diverLicense = diverLicense;
    }
    public DeliveryRider(int riderId, String name, Short age, String idCard, String carLicense, String diverLicense, String phonNumber) {
        this.riderId = riderId;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.carLicense = carLicense;
        this.diverLicense = diverLicense;
        this.phonNumber = phonNumber;
    }

    //3.สร้าง method get/set ของทุกๆ attributes
    public int getRiderId() {
        return riderId;
    }
    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public String getName() {
        return name;
    }  
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }   
    public void setAge(Short age) {
        this.age = age;
    } 

    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCarLicense() {
        return carLicense;
    }
    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public String getDiverLicense() {
        return diverLicense;
    }
    public void setDiverLicense(String diverLicense) {
        this.diverLicense = diverLicense;
    }
    public String getPhonNumber() {
        return phonNumber;
    }
    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }
}
