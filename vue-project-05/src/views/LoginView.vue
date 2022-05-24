<template>
  <div class="home">
    <h1>这是登录页面</h1>
    <el-link href="/admin" type="primary">进入管理页面</el-link>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  }
}
</script>
