package com.pinyougou.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sallergoods.service.BrandServiceI;

@RestController
@RequestMapping("/brand")
public class BrandController { //brand，商品层
	
	  @Reference
	  private  BrandServiceI brandServiceI;
	  
	  @RequestMapping("/getAll")
	  public List<TbBrand>  getAll(){
		  
		  List<TbBrand> findAll = brandServiceI.findAll();
		  System.out.println("getAll");
		  return findAll;
	  }
	  
	  @RequestMapping("/ako")
	  public String  getAko(){
		  
		  return "sss";
	  }

}
