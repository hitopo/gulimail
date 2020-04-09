package com.hitopo.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hitopo.gulimall.product.entity.BrandEntity;
import com.hitopo.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // BrandEntity brand = new BrandEntity();
        // brand.setBrandId(1L);
        // brand.setDescript("全新的手机");
        // brand.setName("华为");
        // brandService.save(brand);
        // System.out.println("保存成功！");
        // brandService.updateById(brand);
        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandList.forEach(System.out::println);
    }

}
