(ns core
  (:require ["react-native" :as rn]
            [expo :as expo]
            [safe-area :as safe-area]

            [reagent.core :as r]))

(defn root []
  (r/as-element [:> rn/Text "Hello CLojure! from CLJS"]))

(defn init
  {:dev/after-load true}
  []
  (expo/registerRootComponent root))



