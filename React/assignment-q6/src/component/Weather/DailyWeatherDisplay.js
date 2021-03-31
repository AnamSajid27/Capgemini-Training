import React, { useState } from 'react'
import { DailyWeather } from '../Service/WeatherService'
import {
    Carousel,
    CarouselItem,
    CarouselControl,
    CarouselIndicators,
    CarouselCaption
} from 'reactstrap';



function DailyWeatherDisplay() {
    let foreCast = [
        {
            "date": "",
            "date_epoch": 0,
            "day": {
                "maxtemp_c": 0,
                "maxtemp_f": 0,
                "mintemp_c": 0,
                "mintemp_f": 0,
                "avgtemp_c": 0,
                "avgtemp_f": 0,
                "maxwind_mph": 0,
                "maxwind_kph": 0,
                "totalprecip_mm": 0,
                "totalprecip_in": 0,
                "avgvis_km": 0,
                "avgvis_miles": 0,
                "avghumidity": 0,
                "daily_will_it_rain": 0,
                "daily_chance_of_rain": "",
                "daily_will_it_snow": 0,
                "daily_chance_of_snow": "",
                "condition": {
                    "text": "",
                    "icon": "",
                    "code": 0
                },
                "uv": 0
            },
            "astro": {
                "sunrise": "",
                "sunset": "",
                "moonrise": "",
                "moonset": "",
                "moon_phase": "",
                "moon_illumination": ""
            },
            "hour": [
                {
                    "time_epoch": 0,
                    "time": "",
                    "temp_c": 0,
                    "temp_f": 0,
                    "is_day": 0,
                    "condition": {
                        "text": "",
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
                    "windchill_c": 0,
                    "windchill_f": 0,
                    "heatindex_c": 0,
                    "heatindex_f": 0,
                    "dewpoint_c": 0,
                    "dewpoint_f": 0,
                    "will_it_rain": 0,
                    "chance_of_rain": "",
                    "will_it_snow": 0,
                    "chance_of_snow": "",
                    "vis_km": 0,
                    "vis_miles": 0,
                    "gust_mph": 0,
                    "gust_kph": 0,
                    "uv": 0
                }]},{ "date": "",
                "date_epoch": 0,
                "day": {
                    "maxtemp_c": 0,
                    "maxtemp_f": 0,
                    "mintemp_c": 0,
                    "mintemp_f": 0,
                    "avgtemp_c": 0,
                    "avgtemp_f": 0,
                    "maxwind_mph": 0,
                    "maxwind_kph": 0,
                    "totalprecip_mm": 0,
                    "totalprecip_in": 0,
                    "avgvis_km": 0,
                    "avgvis_miles": 0,
                    "avghumidity": 0,
                    "daily_will_it_rain": 0,
                    "daily_chance_of_rain": "",
                    "daily_will_it_snow": 0,
                    "daily_chance_of_snow": "",
                    "condition": {
                        "text": "",
                        "icon": "",
                        "code": 0
                    },
                    "uv": 0
                },
                "astro": {
                    "sunrise": "",
                    "sunset": "",
                    "moonrise": "",
                    "moonset": "",
                    "moon_phase": "",
                    "moon_illumination": ""
                },
                "hour": [
                    {
                        "time_epoch": 0,
                        "time": "",
                        "temp_c": 0,
                        "temp_f": 0,
                        "is_day": 0,
                        "condition": {
                            "text": "",
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
                        "windchill_c": 0,
                        "windchill_f": 0,
                        "heatindex_c": 0,
                        "heatindex_f": 0,
                        "dewpoint_c": 0,
                        "dewpoint_f": 0,
                        "will_it_rain": 0,
                        "chance_of_rain": "",
                        "will_it_snow": 0,
                        "chance_of_snow": "",
                        "vis_km": 0,
                        "vis_miles": 0,
                        "gust_mph": 0,
                        "gust_kph": 0,
                        "uv": 0
                    }]},{ "date": "",
                    "date_epoch": 0,
                    "day": {
                        "maxtemp_c": 0,
                        "maxtemp_f": 0,
                        "mintemp_c": 0,
                        "mintemp_f": 0,
                        "avgtemp_c": 0,
                        "avgtemp_f": 0,
                        "maxwind_mph": 0,
                        "maxwind_kph": 0,
                        "totalprecip_mm": 0,
                        "totalprecip_in": 0,
                        "avgvis_km": 0,
                        "avgvis_miles": 0,
                        "avghumidity": 0,
                        "daily_will_it_rain": 0,
                        "daily_chance_of_rain": "",
                        "daily_will_it_snow": 0,
                        "daily_chance_of_snow": "",
                        "condition": {
                            "text": "",
                            "icon": "",
                            "code": 0
                        },
                        "uv": 0
                    },
                    "astro": {
                        "sunrise": "",
                        "sunset": "",
                        "moonrise": "",
                        "moonset": "",
                        "moon_phase": "",
                        "moon_illumination": ""
                    },
                    "hour": [
                        {
                            "time_epoch": 0,
                            "time": "",
                            "temp_c": 0,
                            "temp_f": 0,
                            "is_day": 0,
                            "condition": {
                                "text": "",
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
                            "windchill_c": 0,
                            "windchill_f": 0,
                            "heatindex_c": 0,
                            "heatindex_f": 0,
                            "dewpoint_c": 0,
                            "dewpoint_f": 0,
                            "will_it_rain": 0,
                            "chance_of_rain": "",
                            "will_it_snow": 0,
                            "chance_of_snow": "",
                            "vis_km": 0,
                            "vis_miles": 0,
                            "gust_mph": 0,
                            "gust_kph": 0,
                            "uv": 0
                        }]},{ "date": "",
                        "date_epoch": 0,
                        "day": {
                            "maxtemp_c": 0,
                            "maxtemp_f": 0,
                            "mintemp_c": 0,
                            "mintemp_f": 0,
                            "avgtemp_c": 0,
                            "avgtemp_f": 0,
                            "maxwind_mph": 0,
                            "maxwind_kph": 0,
                            "totalprecip_mm": 0,
                            "totalprecip_in": 0,
                            "avgvis_km": 0,
                            "avgvis_miles": 0,
                            "avghumidity": 0,
                            "daily_will_it_rain": 0,
                            "daily_chance_of_rain": "",
                            "daily_will_it_snow": 0,
                            "daily_chance_of_snow": "",
                            "condition": {
                                "text": "",
                                "icon": "",
                                "code": 0
                            },
                            "uv": 0
                        },
                        "astro": {
                            "sunrise": "",
                            "sunset": "",
                            "moonrise": "",
                            "moonset": "",
                            "moon_phase": "",
                            "moon_illumination": ""
                        },
                        "hour": [
                            {
                                "time_epoch": 0,
                                "time": "",
                                "temp_c": 0,
                                "temp_f": 0,
                                "is_day": 0,
                                "condition": {
                                    "text": "",
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
                                "windchill_c": 0,
                                "windchill_f": 0,
                                "heatindex_c": 0,
                                "heatindex_f": 0,
                                "dewpoint_c": 0,
                                "dewpoint_f": 0,
                                "will_it_rain": 0,
                                "chance_of_rain": "",
                                "will_it_snow": 0,
                                "chance_of_snow": "",
                                "vis_km": 0,
                                "vis_miles": 0,
                                "gust_mph": 0,
                                "gust_kph": 0,
                                "uv": 0
                            }]},{ "date": "",
                            "date_epoch": 0,
                            "day": {
                                "maxtemp_c": 0,
                                "maxtemp_f": 0,
                                "mintemp_c": 0,
                                "mintemp_f": 0,
                                "avgtemp_c": 0,
                                "avgtemp_f": 0,
                                "maxwind_mph": 0,
                                "maxwind_kph": 0,
                                "totalprecip_mm": 0,
                                "totalprecip_in": 0,
                                "avgvis_km": 0,
                                "avgvis_miles": 0,
                                "avghumidity": 0,
                                "daily_will_it_rain": 0,
                                "daily_chance_of_rain": "",
                                "daily_will_it_snow": 0,
                                "daily_chance_of_snow": "",
                                "condition": {
                                    "text": "",
                                    "icon": "",
                                    "code": 0
                                },
                                "uv": 0
                            },
                            "astro": {
                                "sunrise": "",
                                "sunset": "",
                                "moonrise": "",
                                "moonset": "",
                                "moon_phase": "",
                                "moon_illumination": ""
                            },
                            "hour": [
                                {
                                    "time_epoch": 0,
                                    "time": "",
                                    "temp_c": 0,
                                    "temp_f": 0,
                                    "is_day": 0,
                                    "condition": {
                                        "text": "",
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
                                    "windchill_c": 0,
                                    "windchill_f": 0,
                                    "heatindex_c": 0,
                                    "heatindex_f": 0,
                                    "dewpoint_c": 0,
                                    "dewpoint_f": 0,
                                    "will_it_rain": 0,
                                    "chance_of_rain": "",
                                    "will_it_snow": 0,
                                    "chance_of_snow": "",
                                    "vis_km": 0,
                                    "vis_miles": 0,
                                    "gust_mph": 0,
                                    "gust_kph": 0,
                                    "uv": 0
                                }]},{ "date": "",
                                "date_epoch": 0,
                                "day": {
                                    "maxtemp_c": 0,
                                    "maxtemp_f": 0,
                                    "mintemp_c": 0,
                                    "mintemp_f": 0,
                                    "avgtemp_c": 0,
                                    "avgtemp_f": 0,
                                    "maxwind_mph": 0,
                                    "maxwind_kph": 0,
                                    "totalprecip_mm": 0,
                                    "totalprecip_in": 0,
                                    "avgvis_km": 0,
                                    "avgvis_miles": 0,
                                    "avghumidity": 0,
                                    "daily_will_it_rain": 0,
                                    "daily_chance_of_rain": "",
                                    "daily_will_it_snow": 0,
                                    "daily_chance_of_snow": "",
                                    "condition": {
                                        "text": "",
                                        "icon": "",
                                        "code": 0
                                    },
                                    "uv": 0
                                },
                                "astro": {
                                    "sunrise": "",
                                    "sunset": "",
                                    "moonrise": "",
                                    "moonset": "",
                                    "moon_phase": "",
                                    "moon_illumination": ""
                                },
                                "hour": [
                                    {
                                        "time_epoch": 0,
                                        "time": "",
                                        "temp_c": 0,
                                        "temp_f": 0,
                                        "is_day": 0,
                                        "condition": {
                                            "text": "",
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
                                        "windchill_c": 0,
                                        "windchill_f": 0,
                                        "heatindex_c": 0,
                                        "heatindex_f": 0,
                                        "dewpoint_c": 0,
                                        "dewpoint_f": 0,
                                        "will_it_rain": 0,
                                        "chance_of_rain": "",
                                        "will_it_snow": 0,
                                        "chance_of_snow": "",
                                        "vis_km": 0,
                                        "vis_miles": 0,
                                        "gust_mph": 0,
                                        "gust_kph": 0,
                                        "uv": 0
                                    }]},{ "date": "",
                                    "date_epoch": 0,
                                    "day": {
                                        "maxtemp_c": 0,
                                        "maxtemp_f": 0,
                                        "mintemp_c": 0,
                                        "mintemp_f": 0,
                                        "avgtemp_c": 0,
                                        "avgtemp_f": 0,
                                        "maxwind_mph": 0,
                                        "maxwind_kph": 0,
                                        "totalprecip_mm": 0,
                                        "totalprecip_in": 0,
                                        "avgvis_km": 0,
                                        "avgvis_miles": 0,
                                        "avghumidity": 0,
                                        "daily_will_it_rain": 0,
                                        "daily_chance_of_rain": "",
                                        "daily_will_it_snow": 0,
                                        "daily_chance_of_snow": "",
                                        "condition": {
                                            "text": "",
                                            "icon": "",
                                            "code": 0
                                        },
                                        "uv": 0
                                    },
                                    "astro": {
                                        "sunrise": "",
                                        "sunset": "",
                                        "moonrise": "",
                                        "moonset": "",
                                        "moon_phase": "",
                                        "moon_illumination": ""
                                    },
                                    "hour": [
                                        {
                                            "time_epoch": 0,
                                            "time": "",
                                            "temp_c": 0,
                                            "temp_f": 0,
                                            "is_day": 0,
                                            "condition": {
                                                "text": "",
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
                                            "windchill_c": 0,
                                            "windchill_f": 0,
                                            "heatindex_c": 0,
                                            "heatindex_f": 0,
                                            "dewpoint_c": 0,
                                            "dewpoint_f": 0,
                                            "will_it_rain": 0,
                                            "chance_of_rain": "",
                                            "will_it_snow": 0,
                                            "chance_of_snow": "",
                                            "vis_km": 0,
                                            "vis_miles": 0,
                                            "gust_mph": 0,
                                            "gust_kph": 0,
                                            "uv": 0
                                        }]}]
        
    const returnedTarget = Object.assign(foreCast, DailyWeather());
    console.log(returnedTarget)

    const items = [
        {
            src: 'data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22800%22%20height%3D%22400%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20800%20400%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15ba800aa1d%20text%20%7B%20fill%3A%23555%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A40pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15ba800aa1d%22%3E%3Crect%20width%3D%22800%22%20height%3D%22400%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22285.921875%22%20y%3D%22218.3%22%3EFirst%20slide%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E',
            altText: 'Slide 1',
            caption: 'Slide 1'
        },
        {
            src: 'data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22800%22%20height%3D%22400%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20800%20400%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15ba800aa20%20text%20%7B%20fill%3A%23444%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A40pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15ba800aa20%22%3E%3Crect%20width%3D%22800%22%20height%3D%22400%22%20fill%3D%22%23666%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22247.3203125%22%20y%3D%22218.3%22%3ESecond%20slide%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E',
            altText: 'Slide 2',
            caption: 'Slide 2'
        },
        {
            src: 'data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22800%22%20height%3D%22400%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20800%20400%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15ba800aa21%20text%20%7B%20fill%3A%23333%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A40pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15ba800aa21%22%3E%3Crect%20width%3D%22800%22%20height%3D%22400%22%20fill%3D%22%23555%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22277%22%20y%3D%22218.3%22%3EThird%20slide%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E',
            altText: 'Slide 3',
            caption: 'Slide 3'
        }
    ];



    const [activeIndex, setActiveIndex] = useState(0);
    const [animating, setAnimating] = useState(false);
    const [count,setCount]=useState(0)
    const next = () => {
        setCount(count+1)
        if (animating) return;
        const nextIndex = activeIndex === items.length - 1 ? 0 : activeIndex + 1;

        setActiveIndex(nextIndex);
    }

    const previous = () => {
        setCount(count-1)
        if (animating) return;
        const nextIndex = activeIndex === 0 ? items.length - 1 : activeIndex - 1;
        setActiveIndex(nextIndex);
    }

    const goToIndex = (newIndex) => {
        if (animating) return;
        setActiveIndex(newIndex);
    }
    

    const slides = items.map((item) => {
        return (
             
            <CarouselItem
                onExiting={() => setAnimating(true)}
                onExited={() => setAnimating(false)}
                key={item.src}
            >
                
                <div>
                    <img src={foreCast[count].day.condition.icon}/>  <img src={foreCast[count+1].day.condition.icon}/>  <img src={foreCast[count+2].day.condition.icon}/>
                    <p>{foreCast[count].day.avgtemp_c} &#8451;  {foreCast[count+1].day.avgtemp_c} &#8457; {foreCast[count+2].day.avgtemp_c} &#8457; </p>
                    <p>{foreCast[count].day.condition.text}  {foreCast[count+1].day.condition.text} {foreCast[count+2].day.condition.text}</p>
                  
                </div>
              
            </CarouselItem>
        
        );
    });

    return (
        <div>
        <h1>Daily</h1>
        <Carousel
            activeIndex={activeIndex}
            next={next}
            previous={previous}
        >
           
            <CarouselIndicators items={items} activeIndex={activeIndex} onClickHandler={goToIndex} />
            {slides}
            
            <CarouselControl direction="prev" directionText="Previous" onClickHandler={previous} />
            <CarouselControl direction="next" directionText="Next" onClickHandler={next} />
        </Carousel>
        </div>
    );
}



export default DailyWeatherDisplay
