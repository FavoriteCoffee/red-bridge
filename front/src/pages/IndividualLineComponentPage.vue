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
                <p style="text-align: center;"><img src="../assets/nophoto.png" class="lines-img"> </p>
                <h4 class="lines-title">Деталь линии 3000Х</h4>
                <div class="hr"></div>
                <p>Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание Описание </p>
                <details>
                    <summary><h4>&#X203A; Состав детальки</h4></summary>
                    <p>Раскрывающийся контент</p>
                </details>
                <details>
                    <summary><h4>&#X203A; Требования для установки</h4></summary>
                    <p>Раскрывающийся контент</p>
                </details>
                <details>
                    <summary><h4>&#X203A; Установка и ввод в эксплуатацию</h4></summary>
                    <p>Раскрывающийся контент</p>
                </details>
                <details>
                    <summary><h4>&#X203A; Характеристики детали</h4></summary>
                    <p>Раскрывающийся контент</p>
                </details>
                <details>
                    <summary><h4>&#X203A; Специальное предложение</h4></summary>
                    <p>Раскрывающийся контент</p>
                </details>
                <a>Каталог ></a>
            </div>
            <OrderForm></OrderForm>
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
    import OrderForm from "../components/OrderForm.vue"
</script>

<style>
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

    summary {
        list-style: none;
    }

    h4{
        letter-spacing: 0.05em;
        margin-bottom: 15px;
        font-weight: 600;
        font-size: 16px;
    }
</style>

<style scoped>
    .lines-img{
        height: 250px;
        text-align: center;
        
    }

    .lines-title{
        text-align: center;
        margin: 20px 0 20px 0;
    }
    
    .line-order-button{
        color: white;
        font-size: 14px;
        font-weight: bold;
        text-transform: uppercase;
        background-color: #f9283b;
        width: 250px;
        height: 42px;
        border-radius: 30px;
        margin: auto 0;
        margin-bottom: 20px;
        
    }

    p{
        margin-bottom: 20px;
    }
</style>