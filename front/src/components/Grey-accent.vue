<template>
    <div>
        <div class="grey-accent">
            <div class="col">
                <p class="grey-number">
                    1_
                </p>
            </div>
            <div class="col" style="margin-top: 8px;">
                <p class="grey-accent-text">
                    ОСТАВЬТЕ ЗАЯВКУ С КРАТКИМ ОПИСАНИЕМ НУЖНОГО ВАМ ТОВАРА
                </p>
            </div>
            <div style="background-color: white; float: right;">
                <div style="width: 100%;">
                    <div class="triangle-topleft"></div>
                </div>
            </div>
        </div>

        <div class="grey-accent">
            <div class="col">
                <p class="grey-number">
                    2_
                </p>
            </div>
            <div class="col">
                <p class="grey-accent-text">
                    НАШИ СОТРУДНИКИ ПОДБЕРУТ ЛУЧШИЕ ПРЕДЛОЖЕНИЯ ПО <br>
                    ВАШЕМУ ЗАПРОСУ И СВЯЖУТСЯ С ВАМИ
                </p>
            </div>
            <div style="background-color: white; width: 60px; height: 46px; float: right;"></div>
            <div style="background-color: white; float: right;">
                <div style="width: 100%;">
                    <div class="triangle-topleft"></div>
                </div>
            </div>
            
        </div>
        <div class="grey-accent">
            <div class="col">
                <p class="grey-number">
                    3_
                </p>
            </div>
            <div class="col">
                <p class="grey-accent-text">
                    БУДЕТ ВЫБРАН ПОСТАВЩИК И ПРОВЕДЕНЫ ПЕРЕГОВОРЫ <br>
                    ПОСЛЕ ЧЕГО ПОДПИСАН ДОГОВОР
                </p>
            </div>
            <div style="background-color: white; width: 120px; height: 46px; float: right;"></div>
            <div style="background-color: white; float: right;">
                <div style="width: 100%;">
                    <div class="triangle-topleft"></div>
                </div>
            </div>
        </div>
        <div class="grey-accent">
            <div class="col">
                <p class="grey-number">
                    4_
                </p>
            </div>
            <div class="col" style="margin-top: 8px;">
                <p class="grey-accent-text">
                    ДОСТАВКА И МОНТАЖ ОБОРУДОВАНИЯ
                </p>
            </div>
            <div style="background-color: white; width: 180px; height: 46px; float: right;"></div>
            <div style="background-color: white; float: right;">
                <div style="width: 100%;">
                    <div class="triangle-topleft"></div>
                </div>
            </div>
        </div>
    </div>
</template>
    
<style scoped>
    .grey-number{
        font-size: 24px;
        font-weight: bold;
        padding-left: 15px;
        padding-top: 5px;
        width: 55px;
        float: left;

    }

    .grey-accent{
        background-color: #eaeaea;
        height: 45px;
        margin-bottom: 15px;
    

    }

    .v-col{
        display: flex;
        flex-direction: column;
        justify-content: center;
    }

    .col{
        display: flex;
        flex-direction: column;
        justify-content: center;
        float: left;
    }

    .grey-accent-text{
        margin: 5px 0 5px 0;
        font-weight: bold;
        font-size: 12px;
        text-transform: uppercase;
        display: flex;
        flex-direction: column;
        justify-content: center;
    }

    .triangle-topleft {
        width: 0;
        height: 0;
        border-top: 45px solid #eaeaea; 
        border-right: 45px solid transparent;		
       
    }

</style>