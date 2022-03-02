<template>
  <Header/>
  <router-view/>
</template>
<script>
import Header from '@/components/Header/header'

export default {
  name: 'App',
  components: {
    Header
  }
}
</script>
<style>

</style>
