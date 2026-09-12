import axios from 'axios'
// 不要在拦截器里面 import useUserStore！
const service = axios.create({
    baseURL: 'http://localhost:8080',
    timeout: 10000
})

// 请求拦截器：只保留基础逻辑，不在内部实例pinia
service.interceptors.request.use(
    config => {
        return config
    },
    error => {
        return Promise.reject(error)
    }
)

// 响应拦截器
service.interceptors.response.use(
    response => {
        return response.data
    },
    error => {
        if (error.response && error.response.status === 401) {
            // 401跳转这里同样不能useUserStore，先直接跳转页面
            location.href = '/login'
        }
        return Promise.reject(error)
    }
)

export default service
