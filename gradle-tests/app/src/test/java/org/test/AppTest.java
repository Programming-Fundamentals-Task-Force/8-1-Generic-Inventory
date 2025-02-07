package org.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.lab.*;

class InventoryTest {
    @Test void
    new_inventory_is_empty() {
        Inventory<Double> inventory = new Inventory<>();
        List<Double> items = inventory.getAll();
        assertTrue(items.isEmpty());
    }

    @Test void
    items_can_be_added() {
        Inventory<Integer> inventory = new Inventory<>();
        inventory.add(10);
        inventory.add(20);

        assertTrue(inventory.contains(10));
        assertTrue(inventory.contains(20));
        assertFalse(inventory.contains(30));
    }

    @Test void
    duplicated_items_are_added_only_once() {
        Inventory<String> inventory = new Inventory<>();
        inventory.add("Java Programming");
        inventory.add("Data Structures");
        inventory.add("Java Programming");

        List<String> items = inventory.getAll();
        assertEquals(2, items.size());
        assertTrue(items.contains("Java Programming"));
        assertTrue(items.contains("Data Structures"));
    }
}

class DataProcessorTest {
    @Test void
    item_count_for_an_empty_list_must_be_zero() {
        List<Integer> emptyList = List.of();
        int count = DataProcessor.countItems(emptyList);
        assertEquals(0, count);
    }

    @Test void
    item_count_must_equals_added_items() {
        List<String> list = List.of("A", "B", "C");
        int count = DataProcessor.countItems(list);
        assertEquals(3, count);
    }
}