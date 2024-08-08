<template>
    <div id="footer-rec">
        <v-row>
            <v-col cols="3">
                <v-row>
                    <h4>Наша продукция</h4>
                </v-row>    
                <v-row>
                    <a class="footer-nav">Линии</a>
                </v-row>
                <v-row>
                    <a class="footer-nav">Техника</a>
                </v-row>
            </v-col>
            <v-col cols="5">
                <v-row>
                    <h4>Информация для клиентов</h4>
                </v-row>
                <v-row>
                    <a class="footer-nav">О нас</a>
                </v-row>
                <v-row>
                    <a class="footer-nav">Каталог оборудования</a>
                </v-row>
                <v-row>
                    <a class="footer-nav">Как купить</a>
                </v-row>
            </v-col cols="2">
            <v-col id="footer-nav-col3">
                <v-row>
                    <a class="material-symbols-outlined">call</a>
                    <p class="footer-nav" id="footer-contact1">                        
                        +10 8613910036529
                    </p>
                </v-row>
                <v-row>
                    <a class="material-symbols-outlined">call</a>
                    <p class="footer-nav" id="footer-contact2">                       
                        +7 903 651-64-08
                    </p>
                </v-row>
                <v-row id="social-network">
                    <v-col>
                        <img style="height: 15px;" src="../../public/VK1.png">
                    </v-col>
                    <v-col>
                        <img style="height: 24px;" src="../../public/WhatsApp1.png">
                    </v-col>
                    <v-col>
                        <img style="height: 18px;" src="../../public/Telegramm.png">
                    </v-col>
                    <v-col>
                        <img style="height: 17px;" src="../../public/YouTube1.png">
                    </v-col>
                </v-row>
            </v-col>
        </v-row>
    </div>
</template>

<script setup>

</script>

<style>
.material-symbols-outlined{
    padding-top: 2px;
    margin-right: 0.5em;
    
}

#footer-rec{
    color: white;
    padding-left: 125px;
    padding-top: 5%;
    margin-top: 50px;
    background-color: #bc1e2d;
    width: 100%;
    height: 350px;
}

.footer-nav{
    font-size: 14px;
    font-weight: 200;
    text-decoration: underline;
    text-decoration-thickness: .5px;
    letter-spacing: 0.05em;
    margin-bottom: 10px;
}

h4{
    letter-spacing: 0.05em;
    margin-bottom: 15px;
    font-weight: 500;
}

#footer-contact1{
    text-decoration: none;
}

#footer-contact2{
    text-decoration: none;
}

#footer-nav-col3{
    padding-right: 15%;
}

#social-network{
    margin-top: 60px;
}
</style>