package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n02.S04T02N02GraneroEduard.model.repository;


import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n02.S04T02N02GraneroEduard.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit,Long> {

}
