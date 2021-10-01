/*
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)

public class testHomePage {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testHomePage()throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString(" ***")));

    }

}


*/