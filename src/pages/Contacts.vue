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
                <h2>Контакты</h2>
                <h4>Email: <a style="color: #bc1e2d;">most-70@yandex.ru</a></h4>

                <v-row>
                    <v-col cols="5">
                        <h4>Контакты в России</h4>
                        <p>
                            Региональный директор: Акопян Артур Суренович
                            <br>
                            г. Воронеж, ул. Текстильщиков, 2, офис 201
                            <br>
                            Тел/факс: +7 (473) 239-25-22
                            <br>
                            Моб. +7 903 651-64-08
                        </p>
                    </v-col>
                    <v-col cols="2"></v-col>
                    <v-col cols="5">
                        <h4>Контакты в Китае</h4>
                        <p>
                            Генеральный директор: Лю Вэй Тао
                            <br>
                            г. Пекин, район Саоян, ул. Бэйцзиван 32 корпус В — офис 18011
                            <br>
                            тел. +10-(86)-139-1003-6529
                        </p>
                    </v-col>
                </v-row>
                <div class="hr"></div>
                <h3>Вы можете отправить нам сообщение через эту форму:</h3>
                <div>
                    <v-row>
                        <v-col cols="6">
                            <div class="masage-form-outline">
                                <input class="masage-form-input" placeholder="Ваше имя" minlength="1" maxlength="100">
                            </div>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col cols="6">
                            <div class="masage-form-outline">
                                <input class="masage-form-input" placeholder="Email" minlength="1" maxlength="100">
                            </div>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col cols="6">
                            <div class="masage-form-outline">
                                <input class="masage-form-input" placeholder="Тема" minlength="1" maxlength="300">
                            </div>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col cols="6">
                            <div id="masage-form-textarea" class="masage-form-outline">
                                <textarea class="masage-form-textarea" placeholder="Краткое описание необходимого оборудования" minlength="1" maxlength="100"></textarea>
                            </div>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col cols="6">
                            <button class="masage-form-button">
                                отправить
                            </button>
                        </v-col>
                    </v-row>
                </div>

            </div>
            <div>
                <FeedbackForm></FeedbackForm>
                <Prime_news></Prime_news>
            </div>
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

h4{
    letter-spacing: 0.05em;
    margin-bottom: 15px;
    font-weight: 600;
    font-size: 16px;
}

.masage-form-input{
    border: none;
    outline: none;
    font-size: 14px;
    color: #767676;
    background-color: white;
    height: 50px;
    width: 100%;
}

.masage-form-button{
    
    color: white;
    font-size: 14px;
    font-weight: bold;
    text-transform: uppercase;
    background-color: #f9283b;
    width: 100%;
    height: 42px;
    border-radius: 30px;
}

.masage-form-outline{
    border: 0.1em solid black;
    display: inline-flex;
    padding-left: 20px;
    background-color: white;
    margin-bottom: 10px;
    width: 100%;
}

#masage-form-textarea{
    height: 120px;
    padding: 0 0 0 20px;
    width: 100%;
}

textarea{
    margin: 0;
    padding-top: 20px;
    height: auto;
    width: 100%;
    border: none;
}
</style>