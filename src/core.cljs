(ns core
  (:require ["react-native" :as rn]
            [expo :as expo]
            [safe-area :as safe-area]
            [app :as app]
            [reagent.core :as r]))

(defn root []
  (r/as-element (app/app)))

(defn init
  {:dev/after-load true}
  []
  (expo/registerRootComponent root))



