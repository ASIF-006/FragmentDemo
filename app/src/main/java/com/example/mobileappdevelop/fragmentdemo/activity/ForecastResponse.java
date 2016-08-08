package com.example.mobileappdevelop.fragmentdemo.activity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL ASIF on 8/8/2016.
 */
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.Generated;
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
public class ForecastResponse {

    public class Clouds {

        @SerializedName("-value")
        @Expose
        private String value;
        @SerializedName("-all")
        @Expose
        private String all;
        @SerializedName("-unit")
        @Expose
        private String unit;

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The -value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         *
         * @return
         * The all
         */
        public String getAll() {
            return all;
        }

        /**
         *
         * @param all
         * The -all
         */
        public void setAll(String all) {
            this.all = all;
        }

        /**
         *
         * @return
         * The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         *
         * @param unit
         * The -unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

    }
    public class Example {

        @SerializedName("weatherdata")
        @Expose
        private Weatherdata weatherdata;

        /**
         *
         * @return
         * The weatherdata
         */
        public Weatherdata getWeatherdata() {
            return weatherdata;
        }

        /**
         *
         * @param weatherdata
         * The weatherdata
         */
        public void setWeatherdata(Weatherdata weatherdata) {
            this.weatherdata = weatherdata;
        }

    }
    public class Forecast {

        @SerializedName("time")
        @Expose
        private List<Time> time = new ArrayList<Time>();

        /**
         *
         * @return
         * The time
         */
        public List<Time> getTime() {
            return time;
        }

        /**
         *
         * @param time
         * The time
         */
        public void setTime(List<Time> time) {
            this.time = time;
        }

    }
    public class Humidity {

        @SerializedName("-value")
        @Expose
        private String value;
        @SerializedName("-unit")
        @Expose
        private String unit;

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The -value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         *
         * @return
         * The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         *
         * @param unit
         * The -unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

    }
    public class Location {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("location")
        @Expose
        private Location_ location;

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The country
         */
        public String getCountry() {
            return country;
        }

        /**
         *
         * @param country
         * The country
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         *
         * @return
         * The location
         */
        public Location_ getLocation() {
            return location;
        }

        /**
         *
         * @param location
         * The location
         */
        public void setLocation(Location_ location) {
            this.location = location;
        }

    }
    public class Location_ {

        @SerializedName("-altitude")
        @Expose
        private String altitude;
        @SerializedName("-latitude")
        @Expose
        private String latitude;
        @SerializedName("-longitude")
        @Expose
        private String longitude;
        @SerializedName("-geobase")
        @Expose
        private String geobase;
        @SerializedName("-geobaseid")
        @Expose
        private String geobaseid;

        /**
         *
         * @return
         * The altitude
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         *
         * @param altitude
         * The -altitude
         */
        public void setAltitude(String altitude) {
            this.altitude = altitude;
        }

        /**
         *
         * @return
         * The latitude
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         *
         * @param latitude
         * The -latitude
         */
        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        /**
         *
         * @return
         * The longitude
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         *
         * @param longitude
         * The -longitude
         */
        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        /**
         *
         * @return
         * The geobase
         */
        public String getGeobase() {
            return geobase;
        }

        /**
         *
         * @param geobase
         * The -geobase
         */
        public void setGeobase(String geobase) {
            this.geobase = geobase;
        }

        /**
         *
         * @return
         * The geobaseid
         */
        public String getGeobaseid() {
            return geobaseid;
        }

        /**
         *
         * @param geobaseid
         * The -geobaseid
         */
        public void setGeobaseid(String geobaseid) {
            this.geobaseid = geobaseid;
        }

    }
    public class Meta {

        @SerializedName("calctime")
        @Expose
        private String calctime;

        /**
         *
         * @return
         * The calctime
         */
        public String getCalctime() {
            return calctime;
        }

        /**
         *
         * @param calctime
         * The calctime
         */
        public void setCalctime(String calctime) {
            this.calctime = calctime;
        }

    }
    public class Precipitation {

        @SerializedName("-unit")
        @Expose
        private String unit;
        @SerializedName("-value")
        @Expose
        private String value;
        @SerializedName("-type")
        @Expose
        private String type;

        /**
         *
         * @return
         * The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         *
         * @param unit
         * The -unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The -value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         *
         * @return
         * The type
         */
        public String getType() {
            return type;
        }

        /**
         *
         * @param type
         * The -type
         */
        public void setType(String type) {
            this.type = type;
        }

    }
    public class Pressure {

        @SerializedName("-unit")
        @Expose
        private String unit;
        @SerializedName("-value")
        @Expose
        private String value;

        /**
         *
         * @return
         * The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         *
         * @param unit
         * The -unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The -value
         */
        public void setValue(String value) {
            this.value = value;
        }

    }
    public class Sun {

        @SerializedName("-rise")
        @Expose
        private String rise;
        @SerializedName("-set")
        @Expose
        private String set;

        /**
         *
         * @return
         * The rise
         */
        public String getRise() {
            return rise;
        }

        /**
         *
         * @param rise
         * The -rise
         */
        public void setRise(String rise) {
            this.rise = rise;
        }

        /**
         *
         * @return
         * The set
         */
        public String getSet() {
            return set;
        }

        /**
         *
         * @param set
         * The -set
         */
        public void setSet(String set) {
            this.set = set;
        }

    }
    public class Symbol {

        @SerializedName("-number")
        @Expose
        private String number;
        @SerializedName("-name")
        @Expose
        private String name;
        @SerializedName("-var")
        @Expose
        private String var;

        /**
         *
         * @return
         * The number
         */
        public String getNumber() {
            return number;
        }

        /**
         *
         * @param number
         * The -number
         */
        public void setNumber(String number) {
            this.number = number;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The -name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The var
         */
        public String getVar() {
            return var;
        }

        /**
         *
         * @param var
         * The -var
         */
        public void setVar(String var) {
            this.var = var;
        }

    }
    public class Temperature {

        @SerializedName("-unit")
        @Expose
        private String unit;
        @SerializedName("-value")
        @Expose
        private String value;
        @SerializedName("-min")
        @Expose
        private String min;
        @SerializedName("-max")
        @Expose
        private String max;

        /**
         *
         * @return
         * The unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         *
         * @param unit
         * The -unit
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The -value
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         *
         * @return
         * The min
         */
        public String getMin() {
            return min;
        }

        /**
         *
         * @param min
         * The -min
         */
        public void setMin(String min) {
            this.min = min;
        }

        /**
         *
         * @return
         * The max
         */
        public String getMax() {
            return max;
        }

        /**
         *
         * @param max
         * The -max
         */
        public void setMax(String max) {
            this.max = max;
        }

    }
    public class Time {

        @SerializedName("-from")
        @Expose
        private String from;
        @SerializedName("-to")
        @Expose
        private String to;
        @SerializedName("symbol")
        @Expose
        private Symbol symbol;
        @SerializedName("precipitation")
        @Expose
        private Precipitation precipitation;
        @SerializedName("windDirection")
        @Expose
        private WindDirection windDirection;
        @SerializedName("windSpeed")
        @Expose
        private WindSpeed windSpeed;
        @SerializedName("temperature")
        @Expose
        private Temperature temperature;
        @SerializedName("pressure")
        @Expose
        private Pressure pressure;
        @SerializedName("humidity")
        @Expose
        private Humidity humidity;
        @SerializedName("clouds")
        @Expose
        private Clouds clouds;

        /**
         *
         * @return
         * The from
         */
        public String getFrom() {
            return from;
        }

        /**
         *
         * @param from
         * The -from
         */
        public void setFrom(String from) {
            this.from = from;
        }

        /**
         *
         * @return
         * The to
         */
        public String getTo() {
            return to;
        }

        /**
         *
         * @param to
         * The -to
         */
        public void setTo(String to) {
            this.to = to;
        }

        /**
         *
         * @return
         * The symbol
         */
        public Symbol getSymbol() {
            return symbol;
        }

        /**
         *
         * @param symbol
         * The symbol
         */
        public void setSymbol(Symbol symbol) {
            this.symbol = symbol;
        }

        /**
         *
         * @return
         * The precipitation
         */
        public Precipitation getPrecipitation() {
            return precipitation;
        }

        /**
         *
         * @param precipitation
         * The precipitation
         */
        public void setPrecipitation(Precipitation precipitation) {
            this.precipitation = precipitation;
        }

        /**
         *
         * @return
         * The windDirection
         */
        public WindDirection getWindDirection() {
            return windDirection;
        }

        /**
         *
         * @param windDirection
         * The windDirection
         */
        public void setWindDirection(WindDirection windDirection) {
            this.windDirection = windDirection;
        }

        /**
         *
         * @return
         * The windSpeed
         */
        public WindSpeed getWindSpeed() {
            return windSpeed;
        }

        /**
         *
         * @param windSpeed
         * The windSpeed
         */
        public void setWindSpeed(WindSpeed windSpeed) {
            this.windSpeed = windSpeed;
        }

        /**
         *
         * @return
         * The temperature
         */
        public Temperature getTemperature() {
            return temperature;
        }

        /**
         *
         * @param temperature
         * The temperature
         */
        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }

        /**
         *
         * @return
         * The pressure
         */
        public Pressure getPressure() {
            return pressure;
        }

        /**
         *
         * @param pressure
         * The pressure
         */
        public void setPressure(Pressure pressure) {
            this.pressure = pressure;
        }

        /**
         *
         * @return
         * The humidity
         */
        public Humidity getHumidity() {
            return humidity;
        }

        /**
         *
         * @param humidity
         * The humidity
         */
        public void setHumidity(Humidity humidity) {
            this.humidity = humidity;
        }

        /**
         *
         * @return
         * The clouds
         */
        public Clouds getClouds() {
            return clouds;
        }

        /**
         *
         * @param clouds
         * The clouds
         */
        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

    }
    public class Weatherdata {

        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("meta")
        @Expose
        private Meta meta;
        @SerializedName("sun")
        @Expose
        private Sun sun;
        @SerializedName("forecast")
        @Expose
        private Forecast forecast;

        /**
         *
         * @return
         * The location
         */
        public Location getLocation() {
            return location;
        }

        /**
         *
         * @param location
         * The location
         */
        public void setLocation(Location location) {
            this.location = location;
        }

        /**
         *
         * @return
         * The meta
         */
        public Meta getMeta() {
            return meta;
        }

        /**
         *
         * @param meta
         * The meta
         */
        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        /**
         *
         * @return
         * The sun
         */
        public Sun getSun() {
            return sun;
        }

        /**
         *
         * @param sun
         * The sun
         */
        public void setSun(Sun sun) {
            this.sun = sun;
        }

        /**
         *
         * @return
         * The forecast
         */
        public Forecast getForecast() {
            return forecast;
        }

        /**
         *
         * @param forecast
         * The forecast
         */
        public void setForecast(Forecast forecast) {
            this.forecast = forecast;
        }

    }
    public class WindDirection {

        @SerializedName("-deg")
        @Expose
        private String deg;
        @SerializedName("-code")
        @Expose
        private String code;
        @SerializedName("-name")
        @Expose
        private String name;

        /**
         *
         * @return
         * The deg
         */
        public String getDeg() {
            return deg;
        }

        /**
         *
         * @param deg
         * The -deg
         */
        public void setDeg(String deg) {
            this.deg = deg;
        }

        /**
         *
         * @return
         * The code
         */
        public String getCode() {
            return code;
        }

        /**
         *
         * @param code
         * The -code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The -name
         */
        public void setName(String name) {
            this.name = name;
        }

    }
    public class WindSpeed {

        @SerializedName("-mps")
        @Expose
        private String mps;
        @SerializedName("-name")
        @Expose
        private String name;

        /**
         *
         * @return
         * The mps
         */
        public String getMps() {
            return mps;
        }

        /**
         *
         * @param mps
         * The -mps
         */
        public void setMps(String mps) {
            this.mps = mps;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The -name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

}
