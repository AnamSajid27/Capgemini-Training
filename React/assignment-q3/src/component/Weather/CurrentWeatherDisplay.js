import { data } from 'jquery'
import React, { useEffect, useState } from 'react'
import { CurrentWeather } from '../Service/WeatherService'
import DailyWeatherDisplay from './DailyWeatherDisplay';
import Header from './Header';
import HourlyWeatherDisplay from './HourlyWeatherDisplay';
function CurrentWeatherDisplay() {
    let data = {
        "location": {
        "name": "",
        "region": "",
        "country":"" ,
        "lat": 0,
        "lon": 0,
        "tz_id": "",
        "localtime_epoch": 0,
        "localtime": ""
        },
        "current": {
        "last_updated_epoch": 0,
        "last_updated": "",
        "temp_c": 0,
        "temp_f": 0,
        "is_day": 0,
        "condition": {
        "text": "0",
        "icon": "",
        "code": 0
        },
        "wind_mph": 0,
        "wind_kph": 0,
        "wind_degree": 0,
        "wind_dir": "",
        "pressure_mb": 0,
        "pressure_in": 0,
        "precip_mm": 0,
        "precip_in": 0,
        "humidity": 0,
        "cloud": 0,
        "feelslike_c": 0,
        "feelslike_f": 0,
        "vis_km": 0,
        "vis_miles": 0,
        "uv": 0,
        "gust_mph": 0,
        "gust_kph": 0
        }
        }
    
    const returnedTarget = Object.assign(data,CurrentWeather());
    console.log(returnedTarget)
    
    return (
        <div>
            <Header/>
            <div>
           <p>{data.location.name}</p>
           <p>{data.current.temp_c } &#8451; | {data.current.temp_f} &#8457;</p>
           <h2>{data.current.temp_c}  &#8451;</h2>
           <img src={data.current.condition.icon}/>
           <h3>{data.current.condition.text}</h3>
           </div>
           < DailyWeatherDisplay/>
           < HourlyWeatherDisplay/>
        </div>
    )
}

export default CurrentWeatherDisplay
