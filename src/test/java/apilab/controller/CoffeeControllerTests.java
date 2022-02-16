package apilab.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CoffeeControllerTests {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetHome() throws Exception {
        String expectedContent = "Welcome to the Coffee API!";

        this.mockMvcController.perform(
                MockMvcRequestBuilders.get("/coffee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));

    }
}
