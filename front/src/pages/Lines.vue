<template>
    <v-row>
        <Header></Header>
    </v-row>
    <v-row>
        <Top_nav></Top_nav>
    </v-row>
    <v-row>
        <div class="content">
            <div class="main-content">
                <h2>линии</h2>

                <p>
                    Наша компания специализируется на поставке производственных линий из Китая в Россию и страны СНГ, в соответствии с запросами наших клиентов. Наши специалисты помогут Вам подобрать нужного китайского производителя.
                </p>


                <div class="hr"></div>
                <v-row>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img  src="../../favicon.ico">
                                    Экскаватор WYL-3.OB
                                </p>
                            </div>
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </diV>
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                </v-row>
                <v-row>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title"><img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title"><img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                </v-row>
                <v-row>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                        
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                </v-row>
                <v-row>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                        
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                    <v-col cols="4">
                        <diV class="sqr">
                            <div class="nav-image">
                                <p class="sqr-title">
                                    <img src="../../favicon.ico">
                                    танк Т-80
                                </p>
                            </div>
                            
                        </diV>
                    </v-col>
                </v-row>
                <div class="hr"></div>

                <div class="red-accent">
                    <p>
                        БЛАГОДАРЯ ВЫСОКОЙ ЭФФЕКТИВНОСТИ ПРОИЗВОДСТВА, КИТАЙСКИЕ ЗАВОДЫ СПОСОБСТВУЮТ ПОСТАВКЕ ОГРОМНОГО КОЛИЧЕСТВА ТОВАРОВ ПО ВСЕМУ МИРУ 
                    </p>
                </div>

                <h2>
                    Каким образом можно эффективно снизить затраты?
                </h2>

                <p>
                    Ответ на этот вопрос вполне очевиден: необходимо изначально, на этапе планирования производства, сделать грамотный выбор производственного оборудования, по возможности остановившись на полном комплексе взаимосвязанных агрегатов (станков) — автоматической технологической линии. Технологическая производственная линия позволяет в автоматическом режиме с наличием неширокого штата работников выпускать продукцию в едином, последовательном производственном цикле конвейерного типа, начиная от загрузки на линию исходного сырья и заканчивая получением на выходе готовой к реализации продукции с возможностью ее автоматической транспортировки до мест временного хранения (складских помещений). Сегодня можно точно сказать, что производственные линии китайского производства уверенно завоевывают спрос, как в нашей стране, так и во всем мире. На это есть несколько причин.
                </p>
            </div>
            <FeedbackForm></FeedbackForm>
        </div>
    </v-row>
    <v-row>
        <Footer></Footer>
    </v-row>
</template>

<script setup>
    import Header from "../components/Header.vue"
    import Top_nav from "../components/Top-nav.vue"
    import Footer from "../components/Footer.vue"
    import FeedbackForm from "../components/FeedbackForm.vue"
</script>

<style scoped>
    .red-accent{
        padding: 10px 35px 10px 35px;
        background-color: #bc1e2d;
        font-size: 14px;
        text-transform: uppercase;
        margin-bottom: 30px;
        margin-top: 30px;
        font-weight: bold;
        color: white;
    }
</style>
