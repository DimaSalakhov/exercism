(ns gigasecond
 (:import (java.util Calendar)))

(defn setup-calendar
 [year month day]
 (doto (Calendar/getInstance)
  (.set Calendar/YEAR year)
  (.set Calendar/MONTH (dec month))
  (.set Calendar/DAY_OF_MONTH day)
  (.set Calendar/HOUR 1)
  (.set Calendar/MINUTE 1)
  (.set Calendar/SECOND 1)
  (.set Calendar/MILLISECOND 1)
  (.add Calendar/SECOND 1000000000)
  ))


(defn from
 [year month day]
 (let [calendar (setup-calendar year month day)]
  (vector (.get calendar Calendar/YEAR)
          (inc (.get calendar Calendar/MONTH))
          (.get calendar Calendar/DAY_OF_MONTH))))
