<template>
    <div>
        <p>Acessa legal <a :href="meuLink" target="_blank">aqui</a></p>
        <img :src="minhaImagem" style="width: 250px;" :alt="descricao" class="img">
    </div>
</template>

<script>
import sas from "../assets/sas.png"
export default {
    name: "Arg",
    data() {
        return {
            meuLink: "https://www.google.com",
            minhaImagem: sas,
            descricao: "Andre IMG"
        }
    }
}
</script>