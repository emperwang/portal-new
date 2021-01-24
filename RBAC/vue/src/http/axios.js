import axios from 'axios'
import gconfig from './global_config'
import globalConfig from './global_config'

const httpClient = axios.create({
    baseURL: globalConfig.baseUrl,
    timeout: globalConfig.timeout
})

httpClient.interceptors.request.use(function (config) {
    console.log('request interceptor')
    return config;
}, function (error) {
    console.log("request error: ", error);
    return Promise.reject(error);
})

httpClient.interceptors.response.use(function (response) {
    console.log("response inteceptor..")
    return response;
}, function (error) {
    console.log("response error: ", error);
    return Promise.reject(error)
})

export default httpClient;

