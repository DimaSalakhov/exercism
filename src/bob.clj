(ns bob
  (:require [clojure.string :refer [blank?]]))

(defn yell? [phrase]
  (and (re-find #"[A-Z]" phrase)
       (nil? (re-find #"[a-z]" phrase))))

(defn question? [phrase]
  (= \? (last phrase)))

(defn response-for [phrase]
  (cond
    (blank? phrase) "Fine. Be that way!"
    (yell? phrase) "Whoa, chill out!"
    (question? phrase) "Sure."
    :else "Whatever."))