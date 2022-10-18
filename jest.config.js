module.exports = {
    "preset": "react-native",
    "setupFilesAfterEnv": ["@testing-library/jest-native/extend-expect"
    ],
    "setupFiles": [
    ],
    "testPathIgnorePatterns": [
        "timerUtils",
        "examples/"
    ],
    "testTimeout": 60000,
    "transformIgnorePatterns": [
        "/node_modules/(?!(@react-native|react-native|react-native-languages|react-native-shake|react-native-reanimated)/).*/"
    ],
  
    "globals": {
        "__DEV__": true
    },
    "testEnvironment": "node",
      rootDir: "dist-test",
      testMatch: [
        "**/*_spec.js"
      ],

}