<template>
  <div>
      <iframe :src="`https://sbabgame-u.poly188.com`"
              name="refresh_name" id="iframeId" class="iframe-content"
              ref="webIframe" scrolling="auto" allow="fullscreen"
              width="100%" height="100%"
              style="position:fixed; top:0; left:0; bottom:0; right:0; width:100%; height:100%; border:none; margin:0; padding:0; overflow:hidden; z-index:999999;"
              sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts allow-modals allow-popups"
      > </iframe>
  </div>
</template>

<script>

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
