package com.qa.pokeAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.qa.pokeAPI.domain.itemData.ItemData;

public interface ItemDataRepository extends MongoRepository<ItemData, String>
{

	public ItemData findByName(String name);

	public ItemData findByItemId(int itemId);

}
