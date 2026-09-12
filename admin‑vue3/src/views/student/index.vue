<template>
  <div>
    <h2>学生主页 - AI数字人助教</h2>
    <el-button @click="handleLogout">退出登录</el-button>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
import { useUserStore } from '../../stores/user'
const router = useRouter()
const userStore = useUserStore()
const handleLogout = ()=>{
  userStore.logout()
  router.push('/login')
}
</script>
