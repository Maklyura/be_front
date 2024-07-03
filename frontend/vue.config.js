module.exports = {
  outputDir: 'build/dist/public',
  devServer: {
    proxy: 'http://localhost:4000',
    https: true,
  }
}

