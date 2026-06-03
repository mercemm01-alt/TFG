import { HashRouter as Router, Routes, Route, useLocation } from 'react-router-dom';

import Inicio from './pages/inicio';
import Login from './pages/Login/login';
import Registro from './pages/Login/registro';
import EditarPerfil from './pages/Perfil/editarPerfil';
import Recomendaciones from './pages/Recomendaciones/recomendaciones';
import InfoLibro from './pages/InfoLibros/infoLibros';
import Foros from "./pages/Foro/foros";
import ForoChat from "./pages/Foro/foroChat";
import CrearForo from "./pages/Foro/crearForo";
import MisLibros from './pages/MisLibros/misLibros';
import Header from './componentes/Header/header';
import Footer from './componentes/Footer/footer';
import AvisosLegales from "./pages/Legal/avisosLegales";

function AppContent() {
  const location = useLocation();

  const sinHeader = ["/", "/registro"];

  return (
    <div className="app-container">
      
      {!sinHeader.includes(location.pathname) && <Header />}

      <main className="contenido">
        <Routes>
          <Route path="/inicio" element={<Inicio />} />
          <Route path="/" element={<Login />} />
          <Route path="/registro" element={<Registro />} />
          <Route path="/editarPerfil" element={<EditarPerfil />} />
          <Route path="/recomendaciones" element={<Recomendaciones/>}/>
          <Route path="/libro/:id" element={<InfoLibro/>}/>
          <Route path="/foro" element={<Foros/>}/>
          <Route path="/foro/:idForo" element={<ForoChat/>}/>
          <Route path="/crear-foro" element={<CrearForo/>}/>
          <Route path="/mis-libros" element={<MisLibros/>}/>
          <Route path="/avisos-legales" element={<AvisosLegales />}/>
          <Route path="/editar-foro/:idForo" element={<CrearForo />}/>
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