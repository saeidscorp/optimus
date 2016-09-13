(defproject optimus "0.19.0"
  :description "A Ring middleware for frontend performance optimization."
  :url "http://github.com/magnars/optimus"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.memoize "0.5.9"]
                 [org.clojure/data.codec "0.1.0"]
                 [pathetic "0.5.1"]

                 [clj-time "0.12.0"]
                 [clj-jsr223-v8 "0.1.7"]
                 [environ "1.0.2"]
                 [clj-v8 "0.1.5"]
                 [juxt/dirwatch "0.2.3"]
                 [potemkin "0.4.3"]]
  :profiles {:dev {:dependencies [[midje "1.8.3"]
                                  [optimus-test-jar "0.1.0"]
                                  [test-with-files "0.1.1"]]
                   :plugins [[lein-midje "3.2"]
                             [lein-shell "0.5.0"]
                             [lein-environ "1.0.2"]]
                   :resource-paths ["test/resources"]
                   :source-paths ["dev"]
                   :jvm-opts ["-Djava.awt.headless=true"]}}
  :prep-tasks [["shell" "./build-js-sources.sh"]])
