<template>
    <div id="footer-rec">
        <div class="content">
            <v-row>
                <v-col cols="4">
                    <v-row>
                        <h4>Наша продукция</h4>
                    </v-row>    
                    <v-row>
                        <router-link to="/red-bridge/lines" class="footer-nav">
                            <a>Линии</a>
                        </router-link> 
                        
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/technique" class="footer-nav">
                            <a>Техника</a>
                        </router-link> 
                       
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/line-page" class="footer-nav">
                            <a>Демонстрационная страница линий</a>
                        </router-link>
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/line-component-page" class="footer-nav">
                            <a>Демонстрационная страница компонентов линий</a>
                        </router-link>
                    </v-row>
                </v-col>
                <v-col cols="5">
                    <v-row>
                        <h4>Информация для клиентов</h4>
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/about-as" class="footer-nav">
                            <a>О нас</a>
                        </router-link> 
                        
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/lines" class="footer-nav">
                            <a>Каталог оборудования</a>
                        </router-link> 
                        
                    </v-row>
                    <v-row>
                        <router-link to="/red-bridge/lines" class="footer-nav">
                            <a>Как купить</a>
                        </router-link> 
                        
                    </v-row>
                </v-col cols="3">
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
                            <img class="social-network-img" style="height: 15px;" src="../../public/VK1.png">
                        </v-col>
                        <v-col>
                            <img class="social-network-img" style="height: 24px;" src="../../public/WhatsApp1.png">
                        </v-col>
                        <v-col>
                            <img class="social-network-img" style="height: 18px;" src="../../public/Telegramm.png">
                        </v-col>
                        <v-col>
                            <img class="social-network-img" style="height: 17px;" src="../../public/YouTube1.png">
                        </v-col>
                    </v-row>
                </v-col>
            </v-row>
        </div>
    </div>
</template>

<script setup>

</script>

<style>
.social-network-img{
    margin-top: 60px;
}

.content{
    width: 1000px;
    margin: 0 auto;
    
}

.v-row{
    margin: 0;
    padding: 0;
}

.v-col{
    margin: 0;
    padding: 0;
}
</style>

<style scoped>
.material-symbols-outlined{
    padding-top: 2px;
    margin-right: 0.5em;
}


 #footer-rec{
    color: white;
    padding-top: 30px;
    margin-top: 50px;
    background-color: #bc1e2d;
    width: 100%;
    height: 350px;
}

.footer-nav{
    font-size: 14px;
    font-weight: 200;
    text-decoration: underline;
    text-decoration-thickness: 0.5px;
    letter-spacing: 0.05em;
    margin-bottom: 5px;
    color: #fff;
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

/* #footer-nav-col3{
    padding-right: 15%;
} */

#social-network{
    margin-top: 60px;
    width: 200px;
} 
</style>