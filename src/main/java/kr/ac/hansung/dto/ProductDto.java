package kr.ac.hansung.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "상품명을 입력하세요")
    private String name;

    @NotNull(message = "가격을 입력하세요")
    @Min(value = 0, message = "가격은 0 이상이어야 합니다")
    private Integer price;

    private String description;

    @NotNull(message = "재고를 입력하세요")
    @Min(value = 0, message = "재고는 0 이상이어야 합니다")
    private Integer stock;
}
