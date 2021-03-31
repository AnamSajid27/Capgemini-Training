import axios from 'axios'
import {useState,useEffect} from 'react'
export const CurrentWeather = ()=>{
    const [data,setData] = useState()
    let lat=29.7727027;
    let lon=80.0433583;
    useEffect(()=>{
        return axios.get(`http://api.weatherapi.com/v1/current.json?key=cde365793b0c46f68a3135902212303&q=${lat},${lon}&aqi=no`)
    .then((res)=>setData(res.data)).catch(err=>console.log(err))

    },[])
    return data 
}

export const DailyWeather =()=>{
    const [data,setData] = useState()
    let lat=29.7727027;
    let lon=80.0433583;
    useEffect(()=>{
        return axios.get(`http://api.weatherapi.com/v1/forecast.json?key=cde365793b0c46f68a3135902212303&q=${lat},${lon}&days=10&aqi=no&alerts=no`)
    .then((res)=>setData(res.data.forecast.forecastday)).catch(err=>console.log(err))

    },[])
    return data 
}

export const HourlyWeather=()=>{
    const [data,setData] = useState()
    let lat=29.7727027;
    let lon=80.0433583;
    useEffect(()=>{
        return axios.get(`http://api.weatherapi.com/v1/forecast.json?key=cde365793b0c46f68a3135902212303&q=${lat},${lon}&days=1&aqi=no&alerts=no
        `)
    .then((res)=>setData(res.data.forecast.forecastday)).catch(err=>console.log(err))

    },[])
    return data 
}
