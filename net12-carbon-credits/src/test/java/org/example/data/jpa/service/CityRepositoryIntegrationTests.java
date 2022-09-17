///*
// * Copyright 2012-2013 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package org.example.data.jpa.service;
//
//import org.example.data.jpa.MainApplication;
//import org.example.data.jpa.model.City;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static org.hamcrest.Matchers.greaterThan;
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertThat;
//
///*
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MainApplication.class)*/
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = MainApplication.class)
//@WebAppConfiguration
//public class CityRepositoryIntegrationTests {
//
//	@Autowired
//	CityRepository repository;
//
//	@Test
//	public void findsFirstPageOfCities() {
//
//		Page<City> cities = this.repository.findAll(new PageRequest(0, 10));
//		assertThat(cities.getTotalElements(), is(greaterThan(20L)));
//	}
//}
