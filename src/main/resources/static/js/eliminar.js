function eliminar(id){
  Swal.fire({
  title: 'Esta Seguro de Eliminar?',
  text: "You won't be able to revert this!",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Yes, delete it!'
}).then((OK) => {
  if (Ok) {
    $.ajax({
      url:"/eliminar/"+id,
      success: function(res){
        consol.log(res);
      }
    })
    Swal.fire(
      'Deleted!',
      'Your file has been deleted.',
      'success'
    )
  }
}).then((OK)=>{
  location.href="/listar";
});
}
