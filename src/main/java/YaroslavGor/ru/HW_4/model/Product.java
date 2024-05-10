package YaroslavGor.ru.HW_4.model;

import lombok.*;

/**
 * Publication - класс, определяющие характеристики информационного продукта.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String title; // Наименование продукта
    private int article; // Артикул продукта
    private String description; // Описание продукта
    private double cost; // Стоимость продукта


}