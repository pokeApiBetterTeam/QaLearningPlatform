package com.qa.pokeAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.pokeAPI.domain.itemList.ItemList;

public interface ItemListRepository extends MongoRepository<ItemList, String>
{
	public ItemList findById(int Id);
}
