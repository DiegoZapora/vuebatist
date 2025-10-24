<template>
    <div>
        <h2>Estou jogando samp no momento</h2>
        <p>Musicas: </p>
        <Listinfo />
    </div>
</template>

<script>
import Listinfo from './Listinfo.vue';

export default {
    name: "Info",
    components: {
        Listinfo
    }
}
</script>