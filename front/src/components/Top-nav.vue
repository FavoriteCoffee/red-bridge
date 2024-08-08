<template>
    <div id="top-nav-ext">   
        <router-link to="/main" class="nav-link">
            <a class="top-nav">главная</a>
        </router-link> 
        <router-link to="/main" class="nav-link">
            <a class="top-nav">новости</a>
        </router-link> 
        <router-link to="/main" class="nav-link">
            <a class="top-nav">линии</a>
        </router-link> 
        <router-link to="/technique" class="nav-link">
            <a class="top-nav" >техника </a>
        </router-link> 
        <router-link to="/main" class="nav-link">
            <a class="top-nav">видео</a>
        </router-link> 
        <router-link to="/main" class="nav-link">
            <a class="top-nav">о нас</a>
        </router-link>  
        <router-link to="/main" class="nav-link">
            <a class="top-nav">контакты</a>
        </router-link>     
        
        
        
        
        
        
        
 
        <a class="top-nav" id="top-nav-en">en</a>
    </div>
</template>

<script setup>

</script>

<style>
#top-nav-ext{
    margin: 0;
    width: 100%;
    background-color: #f5f5f5;
    padding-left: 100px;
    height: 50px;
    padding-top: 13px;
    padding-right: 0;
}

.top-nav{
    color: black;
    font-size: 14px;
    font-weight: 400;
    text-transform: uppercase;
    text-decoration: underline;
    margin: 0;
    margin-right: 65px;
    letter-spacing: 0.05em;
    
}

#top-nav-en{
    margin-right: 3%;
    text-decoration: none;
    float: right;
}

</style>