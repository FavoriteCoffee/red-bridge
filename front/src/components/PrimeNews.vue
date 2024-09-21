<template>
    <div id="prime-news">
        <h3 id="prime-news-title">
            главные новости
        </h3>
        <div v-if="showNews == 1">
            <div class="prime-news-nav">
                <button class="prime-news-pagination-number">1</button>
                <button class="prime-news-pagination-btn" @click="showNews = 2">2</button>
                <button class="prime-news-pagination-btn" @click="showNews = 3">3</button>
            </div>
            <div class="news">
                <div class="imgd">
                    <img src="../../public/prime_news1.png">
                </div>
                <p>
                <a href="#">
                    
                    Реальное импортозамещение благодаря нашей компанииВ калужской области открылось новое производство подгузников
                </a></p>
            </div>
        </div>
        <div v-if="showNews == 2" class="news">
            <div class="prime-news-nav">
                <button class="prime-news-pagination-btn" @click="showNews = 1">1</button>
                <button class="prime-news-pagination-number">2</button>
                <button class="prime-news-pagination-btn" @click="showNews = 3">3</button>
            </div>
            <div>

            </div>
        </div>
        <div v-if="showNews == 3" class="news">
            <div class="prime-news-nav">
                <button class="prime-news-pagination-btn" @click="showNews = 1">1</button>
                <button class="prime-news-pagination-btn" @click="showNews = 2">2</button>
                <button class="prime-news-pagination-number">3</button>
            </div>
            <div>

            </div>
        </div>
    </div>
</template>

<script setup>
    import { ref, computed } from 'vue';

    const showNews = ref(1)
</script>

<style scoped>
    #prime-news{
        background-color: #f5f5f5;
        color: black;
        width: 280px;
        float: right;
        padding: 20px;
        margin-top: 20px;
    }

    #prime-news-title{
        text-transform: uppercase;
        color: black;
        font-size: 16px;
        font-weight: bold;
        letter-spacing: 0.1em;
        text-align: center;
        margin: 5px 0 5px 0 ;
    }

    .prime-news-nav{
        width: 100%;
        display: flex;
        justify-content: center;
    }

    .news{
        margin-top: 25px;
        margin-bottom: 20px;
    }

    .imgd{
        width: 100%;
        display: flex;
        justify-content: center;  
        margin-bottom: 5px;
    }

    .prime-news-pagination-number{
        width: 22px;
        height: 22px;
        margin: 3px;
        border: solid;
        border-width: 1.5px;
        border-color: black;
        border-radius: 12px;
        font-size: 10px;
        font-weight: 600;
    }

    .prime-news-pagination-btn{
        width: 22px;
        height: 22px;
        margin: 3px;
        font-size: 10px;
        font-weight: 600;
    }

    img{
        width: 100%;
        clear: both;
    }

    a{
        color: black;
        text-align: justify;
    }

</style>