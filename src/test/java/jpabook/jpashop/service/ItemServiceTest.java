package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Album;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired ItemRepository itemRepository;
    @Autowired ItemService itemService;


    @Test
    public void 아이템등록() throws Exception {
        //given
        Item item = new Album();
        item.setName("asd");

        //when
        Long savedId = itemService.saveItem(item);

        //then
        Assertions.assertEquals(itemService.findOne(savedId),item);
    }
}