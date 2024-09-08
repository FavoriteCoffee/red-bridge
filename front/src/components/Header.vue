<template>
    <div class="header-red-fild">
        <v-row class="header-nav"> 
            <router-link to="/main" class="nav-link">
                <a>линии</a>
            </router-link>
            <router-link to="/technique" class="nav-link">
                <a>техника </a>
            </router-link>
            <router-link to="/main" class="nav-link">
                <a >новости</a>
            </router-link> 
            <router-link to="/main" id="last" class="nav-link">
                <a id="last" >видео</a>
            </router-link> 
        </v-row>
        <v-row class="header-title">
            <h1>Красный мост</h1>
        </v-row>
        <v-row class="chinese-number">
            <h5>+10 8613910036529</h5>
        </v-row>
        <v-row class="russian-number">
            <h5>+7 903 651-64-08</h5>
        </v-row>
        <button class="header-button">заявка</button>
    </div>
    <div id="triangle-topleft"></div>
</template>



<style>
body{
    font-family: 'Montserrat', sans-serif;
    background-color: #fff;
}
</style>

<style scoped>
    h1{
        font-size: 36px;
        font-weight: bold;
        text-transform: uppercase;
        color: white;
        margin: 20px 0 3px 0 ;
    }

    a{
        margin: 0;
        margin-right: 11%;
        margin-bottom: 10px;
        float: left;
        color: white;
        font-size: 14px;
        font-weight: 200;
        letter-spacing: 0.05em;
        text-transform: uppercase;
        text-decoration: underline;
        text-decoration-thickness: 0.5px;
    }

    h5{
        color: white;
        font-size: 14px;
        font-weight: 300;
        letter-spacing: 0.1em;
        text-transform: uppercase; 
        margin: 0;
    }

    .header-red-fild{
        background-color: #BC1E2d;
        width: 45%;
        padding: 30px 0 45px 5%;
        float: left;
    }

    .v-row{
        margin: 0;
    }

    .header-button{
        color: white;
        font-size: 14px;
        font-weight: bold;
        text-transform: uppercase;
        background-color: #f9283b;
        width: 135px;
        height: 42px;
        border-radius: 30px;
        margin: 15px 0 0 0 ;
    }

    #triangle-topleft {
	width: 0;
	height: 0;
	border-top: 300px solid #BC1E2d; 
	border-right: 300px solid transparent;			
    }

    #last{
        margin: 0;
    }
    
</style>