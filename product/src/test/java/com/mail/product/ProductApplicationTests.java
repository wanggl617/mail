package com.mail.product;

import com.mail.product.entity.BrandEntity;
import com.mail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        //brandEntity.setBrandId(1L);
        brandEntity.setName("name1");
        brandEntity.setDescript("华为");

        brandService.save(brandEntity);
        System.out.println("保存成功。。");
    }

}
