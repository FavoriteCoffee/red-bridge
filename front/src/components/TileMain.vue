<template>
    <div>
        <v-row>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img  src="../../public/дорожное.png">
                            <a class="mainCategoriesTitle">ДОРОЖНОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/медицинское.png">
                            <a class="mainCategoriesTitle">МЕДИЦИНСКОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </diV>
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/перерабатывающее.png">
                            <a class="mainCategoriesTitle">ПЕРЕРАБАТЫВАЮЩЕЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                    
                </diV>
            </v-col>
        </v-row>
        <v-row>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title"><img src="../../public/пищевое.png">
                            <a class="mainCategoriesTitle">ПИЩЕВОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/промышленное.png">
                            <a class="mainCategoriesTitle">ПРОМЫШЛЕННОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                    
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title"><img src="../../public/развлекательное.png">
                            <a class="mainCategoriesTitle">РАЗВЛЕКАТЕЛЬНОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                    
                </diV>
            </v-col>
        </v-row>
        <v-row>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/аграрное.png">
                            <a class="mainCategoriesTitle">АГРАРНОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                   
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/строительное.png">
                            <a class="mainCategoriesTitle">СТРОИТЕЛЬНОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                    
                </diV>
            </v-col>
            <v-col cols="4">
                <diV class="sqr">
                    <div class="nav-image">
                        <p class="sqr-title">
                            <img src="../../public/химическое.png">
                            <a class="mainCategoriesTitle">ХИМИЧЕСКОЕ</a>
                        </p>
                        <h5 class="mainCategoriesSubtitle">количество штук 5</h5>
                    </div>
                    
                </diV>
            </v-col>
        </v-row>

    </div>
</template>

<script setup>

</script>



<style>
.sqr{
    margin: 0;
    padding: 15px;
    margin-bottom: 10px;
    border: solid;
    border-radius: 5px;
    border-color: #eaeaea;
    border-width: 1px;
    height: 210px;
    width: 210px;
    font-size: 16px;
}

.sqr:hover{
    border: none;
    box-shadow: 0px 3px 10px 0px rgba(0, 0, 0, 0.232); 
}

.sqr-title{
    font-weight: 400;
    text-align: center;
    color: #000;
}

.nav-image{
    width: 100%;
    height: 120px;
    background-color: #fff;
    margin: 0 auto;
}

img{
    height:140px;
    clear: both;
}

.v-row{
    margin: 0;
    padding: 0;
}

.v-col{
    margin: 0;
    padding: 0;
}

.mainCategoriesTitle{
    text-transform: uppercase;
    font-weight: 400;
    font-size: 15px;
}

.mainCategoriesSubtitle{
    color: #767676;
    font-size: 10px;
    text-transform: lowercase;
    text-align: center;
    font-weight: 400;
}
</style>