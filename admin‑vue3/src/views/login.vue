<template>
  <div class="login-container">
    <el-card style="width:400px">
      <h2 style="text-align:center">AI数字人助教系统</h2>
      <el-form ref="loginFormRef" :model="loginForm" label-width="80px">
        <el-form-item label="账号" prop="username">
          <el-input v-model="loginForm.username"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input v-model="loginForm.password" type="password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="handleLogin">登录</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { useUserStore } from '../stores/user'
import request from '../utils/request'

const router = useRouter()
const userStore = useUserStore()
const loginForm = ref({
  username: '',
  password: ''
})

const handleLogin = async () => {
  try {
    // 调用后端登录接口
    const res = await request.post('/user/login', loginForm.value)
    if (res.code === 200) {
      userStore.setToken(res.data.token)
      userStore.setUserInfo(res.data)
      // 根据角色跳转
      if(res.data.role === 'admin'){
        router.push('/admin')
      }else{
        router.push('/student')
      }
    } else {
      alert(res.msg || "登录失败")
    }
  } catch (err) {
    alert("请求异常，检查后端是否启动")
  }
}
</script>

<style scoped>
.login-container{
  height:100vh;
  display:flex;
  justify-content:center;
  align-items:center;
}
</style>
