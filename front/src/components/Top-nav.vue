<template>
    <div id="top-nav-ext">   
        <div id="top-nav-in">
            <router-link to="/red-bridge/main" class="nav-link">
                <a class="top-nav">главная</a>
            </router-link> 
            <router-link to="/red-bridge/news" class="nav-link">
                <a class="top-nav">новости</a>
            </router-link> 
            <router-link to="/red-bridge/lines" class="nav-link">
                <a class="top-nav">линии</a>
            </router-link> 
            <router-link to="/red-bridge/technique" class="nav-link">
                <a class="top-nav" >техника </a>
            </router-link> 
            <router-link to="/red-bridge/main" class="nav-link">
                <a class="top-nav">видео</a>
            </router-link> 
            <router-link to="/red-bridge/about-as" class="nav-link">
                <a class="top-nav">о нас</a>
            </router-link>  
            <router-link to="/red-bridge/contacts" class="nav-link">
                <a class="top-nav">контакты</a>
            </router-link>     
            
            <a class="top-nav" id="top-nav-en">en</a>
        </div>
    </div>
</template>

<script setup>

</script>

<style scoped>
#top-nav-ext{
    margin: 0;
    width: 100%;
    background-color: #f5f5f5;
    
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
    margin-right: 6%;
    letter-spacing: 0.05em;
    
}

#top-nav-en{
    /* margin-right: 3%; */
    text-decoration: none;
    float: right;
    margin-right:0 ;
}

#top-nav-in{
    margin: 0 auto;
    max-width: 1000px;
    
}
</style>