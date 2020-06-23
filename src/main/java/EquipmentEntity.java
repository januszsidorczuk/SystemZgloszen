import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

public class EquipmentEntity {

    @Entity
    @Table(name = "users")
    public static class Wsad {
        public int getId() {
            return id;
        }
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        public void setId(int id) {
            this.id = id;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }


        public Wsad(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        private int id;
        private String imie;
        private String nazwisko;

    }
}
