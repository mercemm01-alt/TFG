import { BrowserRouter as Router, Routes, Route, useLocation } from 'react-router-dom';

import Inicio from './pages/inicio';
import Login from './pages/Login/login';
import Registro from './pages/Login/registro';
import EditarPerfil from './pages/Perfil/editarPerfil';
import Recomendaciones from './pages/Recomendaciones/recomendaciones';
import Header from './componentes/Header/header';
import Footer from './componentes/Footer/footer';

function AppContent() {
  const location = useLocation();

  const sinHeader = ["/login", "/registro"];

  return (
    <div className="app-container">
      
      {!sinHeader.includes(location.pathname) && <Header />}

      <main className="contenido">
        <Routes>
          <Route path="/" element={<Inicio />} />
          <Route path="/login" element={<Login />} />
          <Route path="/registro" element={<Registro />} />
          <Route path="/editarPerfil" element={<EditarPerfil />} />
          <Route path='/recomendaciones' element={<Recomendaciones/>}/>
        </Routes>
      </main>

      {!sinHeader.includes(location.pathname) && <Footer />}

    </div>
  );
}

function App() {
  return (
    <Router>
      <AppContent />
    </Router>
  );
}

export default App;